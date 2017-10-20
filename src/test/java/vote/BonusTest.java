package vote;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bl.vote.domain.Bonus;
import com.bl.vote.domain.BonusDao;

@RunWith(SpringJUnit4ClassRunner.class)
public class BonusTest {

	@Autowired
	BonusDao bonusDao;
	
	@Test
	public void testBonus(){
		List bonusList	=	bonusDao.findOrderPos();
		for (int i = 0; i < bonusList.size(); i++) {
			List bonusMap	=	(List) bonusList.get(i);
			System.out.println(bonusMap.get(0));
		}
	}
}
