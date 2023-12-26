import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Date;

import com.lab.task3.Company;
import com.lab.task2.Auth;
import com.lab.task2.Database;
import com.lab.task2.Авторизація;
import com.lab.task2.БазаДаних;

import com.lab.task1.FacebookUser;
import com.lab.task1.TwitterUser;
import com.lab.task1.TwitterUserAdapter;
import com.lab.task1.FacebookUserAdapter;
import com.lab.task1.MessageSender;


public class Tests {
    @Test
    public void testCompany() {
        Company company = new Company("name", "description", "logo");
        Assertions.assertEquals(company.getName(), "name");
        Assertions.assertEquals(company.getDescription(), "description");
        Assertions.assertEquals(company.getLogo(), "logo");
    }

    @Test
    public void testCompanyToString() {
        Company company = new Company("name", "description", "logo");
        Assertions.assertEquals(company.toString(), 
        "Company(name=name, description=description, logo=logo)");
    }

    @Test
    public void testAuthInheritance() {
        Auth auth = new Auth();
        Assertions.assertTrue(auth instanceof Авторизація);
    }

    @Test
    public void testDataBaseInheritance() {
        Database db = new Database();
        Assertions.assertTrue(db instanceof БазаДаних);
    }

    @Test
    public void testUserAdapter() {
        Date now = new Date();

        TwitterUser twUser = new TwitterUser("email@gmail.com", "USA", now);
        TwitterUserAdapter twUserAdapter = new TwitterUserAdapter(twUser);

        FacebookUser fbUser = new FacebookUser("email@meta.com", "UAE", now);
        FacebookUserAdapter fbUserAdapter = new FacebookUserAdapter(fbUser);

        MessageSender.UserAdapter userOne = twUserAdapter;
        MessageSender.UserAdapter userTwo = fbUserAdapter;

        Assertions.assertEquals(userOne.getUserActiveTime(), now);
        Assertions.assertEquals(userTwo.getUserActiveTime(), now);
    }
}