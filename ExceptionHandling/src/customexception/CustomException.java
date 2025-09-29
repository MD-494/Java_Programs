package customexception;

public class CustomException {
    public static void validatePassword(String password) throws InvalidPassword{
        if(password.length() < 8){
            throw new InvalidPassword("Password must be 8 character long");
        }
    }
    public static void main(String[] args){
        try{
            validatePassword("mansi");
        } catch (InvalidPassword e){
            IO.println(e);
        }
    }
}
