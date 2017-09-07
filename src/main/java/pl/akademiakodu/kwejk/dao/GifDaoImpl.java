package pl.akademiakodu.kwejk.dao;

import org.springframework.stereotype.Component;
import pl.akademiakodu.kwejk.model.Category;
import pl.akademiakodu.kwejk.model.Gif;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by slickender on 04.09.2017.
 */
@Component
public class GifDaoImpl implements GifDao {

    private static List<Gif> gifList = new ArrayList<>();

    public static List<Gif> getGifList() {
        return gifList;
    }

    public static void setGifList(List<Gif> gifList) {
        GifDaoImpl.gifList = gifList;
    }

    static {
        gifList.add(new Gif("android-explosion", "user 1", Category.IT, true));
        gifList.add(new Gif("ben-and-mike", "user 2", Category.ANNOYING, false));
        gifList.add(new Gif("book-dominos", "user 3", Category.OTHER, false));
        gifList.add(new Gif("compiler-bot", "user 4", Category.MACHINES, true));
        gifList.add(new Gif("cowboy-coder", "user 5", Category.OTHER, false));
        gifList.add(new Gif("infinite-andrew", "user 6", Category.ANNOYING, false));
    }

    @Override
    public Gif findOne(String name) {
        for (Gif gif : findAll()) {
            if (gif.getName().equals(name))
                return gif;
        }
        return null;
    }

    @Override
    public List<Gif> findFavorites() {
        List<Gif> gifListFavorites = new ArrayList<>();
        for (Gif gif : gifList) {
            if (gif.isFavorite() == true)
                gifListFavorites.add(gif);
        }
        return gifListFavorites;
    }

    @Override
    public List<Gif> findAll() {
        return gifList;
    }

    @Override
    public Set<Category> findCategories() {
        Set<Category> categorySet = new HashSet<>();
        for (Gif i : gifList) {
            categorySet.add(i.getCategory());
        }
        return categorySet;
    }

    @Override
    public List<Gif> findByCategory(Integer id) {
        List<Gif> searchByCategory = new ArrayList<>();
        for (Gif i : gifList) {
            if (i.getCategory().getId().equals(id)) {
                searchByCategory.add(i);
            }
        }
        return searchByCategory;
        /*gifList.stream().filter((p) -> p.getCategory().getId().equals(id)).collect(Collectors.toList());*/
    }
}
