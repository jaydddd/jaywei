import com.qianfeng.mybatis.dto.IUser;
import com.qianfeng.mybatis.dto.Role;
import com.qianfeng.mybatis.dto.UserDto;
import com.qianfeng.mybatis.dto.UserDto2;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by admin on 2018/3/19.
 */
public class UserTest {
   private  static SqlSessionFactory sessionFactory;
    @BeforeClass
    public static void getSessionFactory(){
        InputStream resourceAsStream = null;
        try {
            resourceAsStream = Resources.getResourceAsStream("mybatis-cfg.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        sessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
    }


    @Test
     public void getUser()  {

            SqlSession sqlSession = sessionFactory.openSession();
            List<UserDto2> objects = sqlSession.selectList("com.qianfeng.mybatis.dto.Userone.userMap");
            for(UserDto2 user:objects){
                System.out.println(user.getName()+"/"+user.getEmail());
            }
            sqlSession.commit();

    }
    @Test
     public void getRole(){
        SqlSession sqlSession = sessionFactory.openSession();
        UserDto2 userDto2 = new UserDto2();
        userDto2.setName("潘冲");
        List<UserDto2> objects = sqlSession.selectList("com.qianfeng.mybatis.dto.Userthree.user", userDto2);
        for(UserDto2 userDto:objects){
            Role role = userDto.getRole();
            System.out.println(role.getRoleName());
        }

    }

    @Test
    public void getUserName(){
        SqlSession sqlSession = sessionFactory.openSession();
        UserDto2 userDto2 = sqlSession.selectOne("com.qianfeng.mybatis.dto.Userone.userMap", "潘冲");
        System.out.println(userDto2.getPassword());
    }
    @Test
    public void getUserValue(){
        SqlSession sqlSession = sessionFactory.openSession();
        IUser mapper = sqlSession.getMapper(IUser.class);
        List<UserDto2> user = mapper.getUser();
        for(UserDto2 users:user){
            System.out.println(users.getName());
        }
    }


}
