import application.service.UserService;
import infra.repository.UserRepository;

public class App {
    public static void main(String[] args) throws Exception {
        UserRepository repository = new UserRepository();
        UserService service = new UserService(repository);

        System.out.println("=== Exemplo com usuario existente ===");
        service.notifyUser(1L, "Ola!");

        System.out.println("\n=== Exemplo com usuario inexistente ===");
        service.notifyUser(99L, "Alguem ai?");
    }
}
