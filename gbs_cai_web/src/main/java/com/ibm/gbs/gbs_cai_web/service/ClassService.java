package com.ibm.gbs.gbs_cai_web.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

import com.ibm.gbs.gbs_cai_web.vo.ClassVO;


public interface ClassService {
	public List<Map<String, Object>> getClassesByCondition(HashMap<String,Object> map) throws Exception;
	
	public List<Map<String, Object>> getDetailByCondition(int idx) throws Exception;
	
	
	/* Class Admin 관련 */
	
	public List<ClassVO> getClassList() throws Exception;
	
	public ClassVO getClassDetail(int idx) throws Exception;
	
	public void addClass(Model model) throws Exception;
	
	public void modifyClass(Model model) throws Exception;
	
	public void deleteClass(int idx) throws Exception;
	
	public void downloadFile(String fileName, String path, HttpServletResponse response) throws Exception;
	
	public void uploadImageAndFiles(MultipartFile image, MultipartFile[] files, ClassVO vo);
	
}
