package hiber.dao;

import hiber.model.User;

public interface CarDao{
    User getByCar(String model, int series);
}
