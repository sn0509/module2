package data.user;

import user.User;

import java.util.ArrayList;
import java.util.List;

public class UserDataList {
    private static UserDataList instance;
    private final List<User> userList;
    private UserReaderData userReaderData;

    private UserDataList(){
        userList = new ArrayList<>();
    }

    public static synchronized UserDataList getInstance(){
        if(instance == null){
            instance = new UserDataList();
        }
        return instance;
    }

    public void addUser(User user){
        userList.add(user);
    }
    public  List<User> getUserList(){

        return userList;
    }
    public static void releaseInstance(){
        instance = null;
    }


    @Override
    public String toString() {
        return "UserDataList{" +
                "userList=" + userList +
                '}';
    }
}
