package com.Me_and_U.project.dao;

import java.util.ArrayList;

import com.Me_and_U.project.model.FaqVO;
import com.Me_and_U.project.model.QnaVO;

public interface IFaqDAO {
	public ArrayList<FaqVO> listAllFaq(); 	
	public FaqVO detailViewFaq(int faqNo); 
	
}

