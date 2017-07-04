package com.trade.actions;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.trade.domain.Goods;
import com.trade.domain.PageBean;
import com.trade.services.GoodsService;
import com.trade.services.StudentService;

public class GoodsAction extends ActionSupport implements ModelDriven<Goods> {

	private Goods goods = new Goods();

	@Override
	public Goods getModel() {
		return goods;
	}

	private GoodsService goodsService;
	private StudentService studentService;

	public void setGoodsService(GoodsService goodsService) {
		this.goodsService = goodsService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	private File upload;
	private String uploadContentType;
	private String uploadFileName;

	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public String findAll() {
		List<Goods> list = goodsService.findAll();
		ActionContext.getContext().getValueStack().set("list", list);
		return "findAll";
	}

	public String loginedFindAll() {
		List<Goods> list = goodsService.findAll();
		ActionContext.getContext().getValueStack().set("list", list);
		return "loginedFindAll";
	}

	public String upload() throws IOException {
		String path = ServletActionContext.getServletContext().getRealPath(
				"/images");
		File file = new File(path);
		if (!file.exists()) {
			file.mkdir();
		}
		FileUtils.copyFile(upload, new File(file, uploadFileName));
		goods.setGoodsPicture(uploadFileName);
		goodsService.upload(goods);
		return "uploadSuccess";
	}

	private String searchName;

	public void setSearchName(String searchName) {
		this.searchName = searchName;
	}

	public String search() {
		List<Goods> searchList = goodsService.findByName(searchName);
		ActionContext.getContext().getValueStack().set("list", searchList);
		return "searchSuccess";
	}

	public String loginedSearch() {
		List<Goods> searchList = goodsService.findByName(searchName);
		ActionContext.getContext().getValueStack().set("list", searchList);
		return "loginedSearchSuccess";
	}

	private Integer searchId;

	public void setSearchId(Integer searchId) {
		this.searchId = searchId;
	}

	public String details() {
		Goods existGoods = goodsService.findById(searchId);
		ActionContext.getContext().getSession().put("existGoods", existGoods);
		return "details";
	}

	public String myGoods() {

		Integer existStudentId = (Integer) ActionContext.getContext()
				.getSession().get("existStudentId");
		List<Goods> myList = new ArrayList<Goods>();

		if (existStudentId == null) {
			myList = goodsService
					.findMyGoods(goods.getStudent().getStudentId());
			ActionContext.getContext().getSession()
					.put("existStudentId", goods.getStudent().getStudentId());
		} else {
			myList = goodsService.findMyGoods(existStudentId);
		}
		ActionContext.getContext().getValueStack().set("myList", myList);

		return "myGoods";
	}

	public String delete() {
		goods = goodsService.findById(searchId);
		goodsService.delete(goods);
		return "deleteSuccess";
	}

	public String edit(){
		Goods existgoods=goodsService.findById(searchId);
		ActionContext.getContext().getSession().put("existGoods", existgoods);
		return "editSuccess";
	}
	
	public String update() throws IOException{
		String path = ServletActionContext.getServletContext().getRealPath(
				"/images");
		File file = new File(path);
		if (!file.exists()) {
			file.mkdir();
		}
		FileUtils.copyFile(upload, new File(file, uploadFileName));
		goods.setGoodsPicture(uploadFileName);
		goodsService.update(goods);
		return "updateSuccess";
	}
}
