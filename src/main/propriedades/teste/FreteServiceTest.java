package teste;
import entity.*;
import repository.DAOGenerico;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
public class FreteServiceTest {
    private FreteService freteService;
    private DAOGenerico<Frete> freteDAO;
    private DAOGenerico<Cliente> clienteDAO;
    private DAOGenerico<Distancia> distanciaDAO;
    private DAOGenerico<CategoriaFrete> categoriaFreteDAO;
    private EntityManager entityManager;
}
