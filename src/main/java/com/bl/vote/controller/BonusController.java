package com.bl.vote.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JsonParser;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONArray;
import com.bl.vote.domain.Bonus;
import com.bl.vote.domain.BonusDao;
import com.bl.vote.domain.BonusId;
import com.bl.vote.domain.Detail;
import com.bl.vote.domain.Payment;
import com.bl.vote.domain.Title;
import com.bl.vote.domain.run_match;
import com.bl.vote.domain.run_matchJpaRepository;


@RestController
public class BonusController {

	@Autowired
	private BonusDao bonusDao;
	@Autowired
    private run_matchJpaRepository rmDtoRepository1;
    
	
	/**
	 * 查询所有问题
	 * 
	 * @return
	 */
	@RequestMapping("/findmatch")
    public Object getBooks()
    {
		//String jsonArray = JSONArray.toJSONString(rmDtoRepository1.findAll());  
		//直接解析成json
		System.out.println("findmatch");
		return rmDtoRepository1.findAll();
    }

	/**
	 * 查询所有问题
	 * 
	 * @return
	 */
	@RequestMapping("/findBonus")
	public Object findBonus() {
		//JSON解析工具
		JsonParser jp = JsonParserFactory.getJsonParser();
		//bonusDao 是SQL语句所在
		// bonus 是返回的数据对象
		List bonus = bonusDao.findOrderPos();
		for (int i = 0; i < bonus.size(); i++) {
			//将数据取出到 bonusArray 对象中
			Object[] bonusArray = (Object[]) bonus.get(i);
			Bonus bonusTotal = new Bonus();
			bonusTotal.setCalculateType("1");
			bonusTotal.setSysid("1109");
			Title title = new Title();
			title.setOrderId((String) bonusArray[1]);
			title.setPayTime((String) bonusArray[2]);
			title.setSendTime((String) bonusArray[2]);
			title.setDocType("1");
			title.setTicketId((String) bonusArray[1]);
			title.setMemberId((String) bonusArray[3]);
			title.setCardNo((String) bonusArray[3]);
			List posTitleOut = new ArrayList();
			posTitleOut.add(title);
			bonusTotal.setTitles(posTitleOut);
			String orderId = (String) bonusArray[0];
			/**
			 * 获取POS机明细
			 */
			List posDetailList = bonusDao.findOrderPosDetail(orderId);
			List posDetailOut = new ArrayList();
			for (int j = 0; j < posDetailList.size(); j++) {
				Object[] bonusDetailArray = (Object[]) posDetailList.get(j);
				Detail detail = new Detail();
				detail.setCouponAmount( ((Integer)bonusDetailArray[0]).doubleValue()/100);
				detail.setDiscountAmount(0);
				detail.setGoodsDetSid((String) bonusDetailArray[2]);
				detail.setGoodsName((String) bonusDetailArray[4]);
				detail.setItemId(String.valueOf(j));
				detail.setOrigPrice(((Integer)bonusDetailArray[1]).doubleValue()/100);
				detail.setSalePrice(((Integer)bonusDetailArray[1]).doubleValue()/100);
				detail.setSaleQuantity((BigDecimal) bonusDetailArray[3]);
				detail.setSupplySid((String) bonusDetailArray[5]);
				posDetailOut.add(detail);
			}
			bonusTotal.setDetails(posDetailOut);

			List posPaymentList = bonusDao.findOrderPosPayment(orderId);
			if(posPaymentList==null||posPaymentList.size()==0){
				continue;
			}
			List posPaymentOut = new ArrayList();
			for (int k = 0; k < posPaymentList.size(); k++) {
				Object[] bonusPaymentArray = (Object[]) posPaymentList.get(k);
				Payment payment = new Payment();
				payment.setPayModeId("000");
				payment.setPayModeName("现金支付");
				payment.setPayAmount(((Integer)bonusPaymentArray[1]).doubleValue()/100);
				posPaymentOut.add(payment);
			}
			bonusTotal.setPayments(posPaymentOut);
			//JSON配置和解析
			String jsonArray = JSONArray.toJSONString(bonusTotal);  
			System.out.println(jsonArray);
		}
		return bonus;
	}

}
