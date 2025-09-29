package customexception;

   class InvalidPassword extends Exception {
   public InvalidPassword(String message){
       super(message);
    }
}
