package yslaestudos.ysla.rest.api.repository;

import org.jboss.jandex.Index;
import org.springframework.data.repository.CrudRepository;
import yslaestudos.ysla.rest.api.model.UsuarioModel;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {
}
