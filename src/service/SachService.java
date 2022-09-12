package service;

import java.util.List;
import model.Sach;
import repository.SachRepository;

public class SachService {

    private SachRepository repository;

    public SachService() {
        repository = new SachRepository();
    }

    public List<Sach> getAll() {
        return repository.getAll();
    }

    public int them(Sach s) {
        if (repository.findByMa(s.getMa()) != null) {
            return 1;
        }
        if (repository.them(s)) {
            return 0;
        }
        return -1;
    }

    public int sua(Sach s) {
        if (repository.findByMa(s.getMa()) == null) {
            return 1;
        }
        if (repository.sua(s)) {
            return 0;
        }
        return -1;
    }

    public boolean xoa(String ma) {
        return repository.xoa(ma);
    }

}
