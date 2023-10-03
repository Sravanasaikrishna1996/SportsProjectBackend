package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import dao.AdminDAO;
import entity.Admin;

@Component
public class AdminService {

	 @Autowired
	 private AdminDAO adminDAO;

		@Transactional
		public Admin authenticate(String adminId, String pwd) {
			return adminDAO.authenticate(adminId, pwd);
		}
		
		@Transactional
		public Admin getAdminById(long id) {
			return adminDAO.getAdminById(id);
		}		
		
		@Transactional
		public void updatePwd(Admin admin) {
			adminDAO.updatePwd(admin);
		}




		 
}
