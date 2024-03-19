package jp.ac.ohara.E.seisaku.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import jp.ac.ohara.E.seisaku.model.GakuseiHyou;
import jp.ac.ohara.E.seisaku.repository.GakuseiRepository;
 

@Service
@Transactional
public class  GakuseiService{

    @Autowired
    private GakuseiRepository repository;


    public void save(@NonNull GakuseiHyou gakusei) {
        this.repository.save(gakusei);
    }
}
