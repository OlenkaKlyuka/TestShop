package dataProvider;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

public class UserUnmarshal {

    public List<UserData> createObjectsUserData(String file) {
        try {
            JAXBContext context = JAXBContext.newInstance(Users.class);
            Unmarshaller un = context.createUnmarshaller();
            Users usersModel = (Users) un.unmarshal(new File(file));
            return usersModel.getUsers();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}
