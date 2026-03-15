package mapper;

import domains.Cliente;
import dto.ClienteDTO;

public class ClienteMapper {

    public static Cliente toEntity(ClienteDTO dto) {

        Cliente cliente = new Cliente();
        cliente.setNome(dto.getNome());
        cliente.setEmail(dto.getEmail());

        return cliente;
    }
}
