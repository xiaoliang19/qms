package com.thinkgem.jeesite.common.utils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.thinkgem.jeesite.common.mapper.JsonMapper;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class MoHuFind {
    
	
	public HashMap findMoHU(String form1) {
		HashMap hashmap =new HashMap();		
		JSONArray jsonArr=JSONArray.fromObject(form1);	  
		for(int i=0; i<jsonArr.size();i++) {			
			 JSONObject info = (JSONObject) jsonArr.getJSONObject(i);
			 String id = info.getString("name");
			 String infoName = info.getString("value");
			 hashmap.put(id, infoName);
		}	
		return hashmap;
	}
	
	
	
}
