package pl.lodz.uni.math.BankApplication.User;


import java.util.ArrayList;

public class UserService {
    protected User userToBeCreated;
    protected ArrayList<Client> listOfClients = new ArrayList<Client>();
    protected ArrayList<Employee> listOfEmployee = new ArrayList<Employee>();
    protected ArrayList<Director> listOfDirectors = new ArrayList<Director>();

    public void createNewUser(String typeOfUser) throws Exception {
        switch(typeOfUser){
            case "client":
                this.userToBeCreated = new Client();
                break;
            case "employee":
                this.userToBeCreated = new Employee();
                break;
            case "director":
                this.userToBeCreated = new Director();
                break;
                default:
                    throw new Exception("invalid type of user");
        }
    }

    public User getUserToBeCreated() {
        return userToBeCreated;
    }
    public void addNewClientToTheListOfClients(){
        listOfClients.add((Client) this.userToBeCreated);
    }
    public ArrayList<Client> getClients(){
        return listOfClients;
    }
}
