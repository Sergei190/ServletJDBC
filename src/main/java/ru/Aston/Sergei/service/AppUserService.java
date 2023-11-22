package ru.Aston.Sergei.service;

import ru.Aston.Sergei.enumeration.UserRole;
import ru.Aston.Sergei.model.AppUser;

import java.util.List;

public interface AppUserService {
    AppUser createUser(AppUser user);

    AppUser getUserById(int userId);

    List<AppUser> getAllUsers();

    AppUser updateUser(AppUser user);

    void deleteUser(int userId);

    void assignUserRole(int userId, UserRole role);

    void removeUserRole(int userId, UserRole role);
}
