package br.com.bb.compra.service.impl;

import br.com.bb.compra.clients.ProdutoQuarkusClient;
import br.com.bb.compra.model.Produto;
import br.com.bb.compra.model.entity.ProdutoEntity;
import br.com.bb.compra.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProdutoServiceClient implements ProdutoService {

    private final ProdutoQuarkusClient quarkusClient;

    @Override
    public Produto salvar(Produto novoProduto) {
        return quarkusClient.salvar(novoProduto);
    }

    @Override
    public List<Produto> salvarLista(List<Produto> novoProduto) {
//        final List<ProdutoEntity> produtoEntityList = ProdutoConverter.convertProductTo(novoProduto);
//        final List<ProdutoEntity> produtoEntities = new ArrayList<>();
//        final Iterable<ProdutoEntity> iterable = quarkusClient.saveAll(produtoEntityList);
//        iterable.forEach(produtoEntities::add);
//        return ProdutoConverter.convertEntityTo(produtoEntities);
        return null;
    }

    @Override
    public Produto buscaPorId(Long id) {
        return quarkusClient.buscaPorId(id);
    }

    @Override
    public Produto deletarPorId(Long id) {
        return null;
    }

    @Override
    @Transactional(readOnly = true)
    public boolean isEmpty() {
        return false;// quarkusClient.count() == 0;
    }

    @Override
    public Page<ProdutoEntity> listar(String filtro, Pageable pageable) {
        return null;
    }

    @Override
    public Page<ProdutoEntity> listar(Pageable pageable) {
        return null;
    }


}
