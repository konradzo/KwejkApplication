package pl.akademiakodu.kwejk.dao;

import pl.akademiakodu.kwejk.model.Category;
import pl.akademiakodu.kwejk.model.Gif;

import java.util.List;
import java.util.Set;

/**
 * Created by slickender on 04.09.2017.
 */
public interface GifDao {
    Gif findOne(String name);

    List<Gif> findFavorites();

    List<Gif> findAll();

    Set<Category> findCategories();

    List<Gif> findByCategory(Integer id);

}
