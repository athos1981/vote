package com.bl.vote.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


/**
 * 数据访问接口
 * @author Administrator
 *
 */
@Repository
public interface BonusDao extends CrudRepository<BonusId,String>{

	@Query(value="SELECT ord.pk_sales_order_id,ord.order_no,DATE_FORMAT(ord.trade_date,'%Y%m%d%H%i%s'),ord.menber_name FROM t_pos_sales_order ord where ord.order_status='ECR109' and ord.menber_name <>'' and DATE_FORMAT(ord.order_time,'%Y%m%d%H%i%s') <'20170712160000' and DATE_FORMAT(ord.order_time,'%Y%m%d%H%i%s') >'20170712000000'",nativeQuery=true)
	public List findOrderPos();
	
	@Query(value="select detail.favorable_amount,detail.price,detail.sku_id,detail.quantity,sku.sku_full_name,sup.supplier_code from t_pos_sales_detail detail,t_mdm_sku sku,t_mdm_supplier sup where detail.sku_id=sku.pk_sku_id and sku.fk_supplier_id=sup.pk_supplier_id and detail.is_delete=1 and sku.is_delete=1 and sku.is_delete=1 and detail.fk_sales_order_id=:orderId",nativeQuery=true)
	public List findOrderPosDetail(@Param("orderId")  String orderId);
	
	@Query(value="select ord.pay_type,ord.pay_price from t_store_pay_response ord where ord.fk_order_id=:orderId and ord.is_delete=1 and ord.pay_type<>'BL2604'",nativeQuery=true)
	public List findOrderPosPayment(@Param("orderId")  String orderId);

}
