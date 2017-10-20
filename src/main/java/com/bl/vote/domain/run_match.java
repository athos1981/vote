package com.bl.vote.domain;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "run_match.findBymatchname", query = "SELECT mid,matchname,postion from run_match where mid= ?1")
public class run_match implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    
	@Id
    long mid;
    @Column(name = "matchname")
    String matchname;
    @Column(name = "postion")
    String postion;
    

    /**
	 * @return the mid
	 */
	public long getMid() {
		return mid;
	}
	/**
	 * @param mid the mid to set
	 */
	public void setMid(long mid) {
		this.mid = mid;
	}
	/**
	 * @return the matchname
	 */
	public String getMatchname() {
		return matchname;
	}
	/**
	 * @param matchname the matchname to set
	 */
	public void setMatchname(String matchname) {
		this.matchname = matchname;
	}
	/**
	 * @return the postion
	 */
	public String getPostion() {
		return postion;
	}
	/**
	 * @param postion the postion to set
	 */
	public void setPostion(String postion) {
		this.postion = postion;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}