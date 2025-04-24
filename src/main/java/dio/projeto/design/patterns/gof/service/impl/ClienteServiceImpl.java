package dio.projeto.design.patterns.gof.service.impl;

import java.util.Optional;

import dio.projeto.design.patterns.gof.model.Cliente;
import dio.projeto.design.patterns.gof.model.ClienteRepository;
import dio.projeto.design.patterns.gof.model.Endereco;
import dio.projeto.design.patterns.gof.model.EnderecoRepository;
import dio.projeto.design.patterns.gof.service.ClienteService;
import dio.projeto.design.patterns.gof.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Implementação da <b>Strategy</b> {@link ClienteService}, a qual pode ser
 * injetada pelo Spring (via {@link Autowired}). Com isso, como essa classe é um
 * {@link Service}, ela será tratada como um <b>Singleton</b>.
 *
 * @author falvojr
 */
@Service
public class ClienteServiceImpl implements ClienteService {

    // Singleton: Injetar os componentes do Spring com @Autowired.
    // Strategy: Implementar os métodos definidos na interface.
    // Facade: Abstrair integrações com subsistemas, provendo uma interface simples.

    @Override
    public Iterable<Cliente> buscarTodos() {
        // Buscar todos os Clientes.
        return null;
    }

    @Override
    public Cliente buscarPorId(Long id) {
        // Buscar Cliente por ID.
        return null;
    }

    @Override
    public void inserir(Cliente cliente) {
        //TODO
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        // Buscar Cliente por ID, caso exista:

    }

    @Override
    public void deletar(Long id) {
        // Deletar Cliente por ID.

    }

    private void salvarClienteComCep(Cliente cliente) {
        // Verificar se o Endereco do Cliente já existe (pelo CEP).


        // Inserir Cliente, vinculando o Endereco (novo ou existente).
        ;
    }

}
