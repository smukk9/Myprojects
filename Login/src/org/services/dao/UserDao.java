package org.services.dao;





import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.services.dto.User;
import org.services.hibernateutil.HibernateUtil;

public class UserDao {


	public boolean add_user( String password, String u_name, String E_mail, Long p_num, String country){
		try{
			//load configruration file

			Session session = HibernateUtil.getSessionfactory().openSession();
			//create a transaction
			Transaction trans = session.beginTransaction();

			User user = new User();
			user.setUser_Name(u_name);
			user.setPassword(password);
			user.setE_mail(E_mail);
			user.setPhone_Number(p_num);
			user.setCountry(country);
			session.save(user);
			trans.commit();
			session.close();
			return true;
		}
		catch(Exception e){

			e.printStackTrace();
			return false;
		}


	}

	public User userExists(String u_name,String pwd){

		Session session = HibernateUtil.getSessionfactory().openSession();
		Transaction trans = session.beginTransaction();
		Query querry = session.getNamedQuery("userByIdPwd");
		querry.setString(0, u_name);

		User values = (User)querry.uniqueResult();
		trans.commit();
		session.close();
		if(values!=null){

			if(pwd.equals(values.getPassword())){
System.out.println(values.getUser_Name());
				return values;
			}else{
				
				throw new RuntimeException("Password is worng :" );
			}
		}

		return null;
	}
	
	public User peekuser(String uname)
	{
		Session session =HibernateUtil.getSessionfactory().openSession();
		Transaction transpeek = session.beginTransaction();
		Query query = session.getNamedQuery("userByIdPwd");
		query.setString(0, uname);
		User u_details = (User) query.uniqueResult();
		transpeek.commit();
		session.close();
		u_details.showUser();
		return u_details;
		
	}
	
	
	
}












