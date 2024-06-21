public class UserApp {
    public static void main(String[] args) throws Exception {
        /*object */
        var user1 = new User();
        User user2 = new User();
        User user3;
         user3 = new User();

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        /*filed */
        var User = new User();
        User.username = "fidaa";
        User.password = "07062006";
        User.phoneNumber = "085784667084";
        User.admin = true;
    
        //user.country = "indonesia";
        System.out.println("Username : "+User.username);
        System.out.println("Password :"+User.password);
        System.out.println("phoneNumber :"+User.phoneNumber);
        System.out.println("Admin : "+User.admin);
        
        var user4 = new User() ;
        user4.userMe();
        user4.login("fidaa", "07062006");

        var user5 = new User();
        user5.username = "fidaa";
        user5.password = "07062006";
        user5.userMe();
        user5.login("fidaa","07062006");

        var user6 = new User("fidaa","07062006", "085784667084", true);
        user6.userMe();

        var User7 = new User("fidaa","07062006");
        User7.userMe();
        User7.login("fidaa", "07062006");

        var user8 =new User ("username8","07062006");
        user8.userMe();
        user8.login("username8","07062006");
        
        
    }
}
