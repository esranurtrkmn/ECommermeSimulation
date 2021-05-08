package core.abstracts;



public interface EmailConfirmService {

	boolean confirmEmail(String eMail);
	boolean isConfirm();
}
