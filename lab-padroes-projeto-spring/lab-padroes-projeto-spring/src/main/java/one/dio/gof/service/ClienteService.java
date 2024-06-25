package one.dio.gof.service;


import one.dio.gof.model.Cliente;

/**
 * Interface para definir o padrão Strategy no cliente. Com isso, se necessário, podemos ter
 * multiplas implementações dessa mesma interface.
 *
 * @author Wkallil
 */
public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
