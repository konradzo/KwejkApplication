package pl.akademiakodu.kwejk.dao;

import org.springframework.stereotype.Component;
import pl.akademiakodu.kwejk.model.Category;
import pl.akademiakodu.kwejk.model.Gif;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by slickender on 04.09.2017.
 */
@Component
public class GifDaoImpl implements GifDao{

    private static  List<Gif> gifList=new ArrayList<>();
    private static  List<Gif> gifListFavorites=new ArrayList<>();

    public static List<Gif> getGifList() {
        return gifList;
    }

    public static void setGifList(List<Gif> gifList) {
        GifDaoImpl.gifList = gifList;
    }

    static{
        gifList.add(new Gif("android-explosion","użytkownik 1", Category.IT));
        gifList.add(new Gif("ben-and-mike","użytkownik 2", Category.ANNOYING));
        gifList.add(new Gif("book-dominos","użytkownik 3", Category.OTHER));
        gifList.add(new Gif("compiler-bot","użytkownik 4", Category.MACHINES));
        gifList.add(new Gif("cowboy-coder","użytkownik 5", Category.OTHER));
        gifList.add(new Gif("infinite-andrew","użytkownik 6", Category.ANNOYING));
    }

    static{
        gifListFavorites.add(new Gif("android-explosion","użytkownik 1"));
        gifListFavorites.add(new Gif("compiler-bot","użytkownik 4"));
    }

    @Override
    public Gif findOne(String name) {
        return gifList.stream().filter((p)->p.getName().equals(name)).findFirst().get();
    }

    @Override
    public List<Gif> findFavorites() {
        return gifListFavorites;
    }

    @Override
    public List<Gif> findAll() {
        return gifList;
    }

    @Override
    public Set<Category> findCategories() {
        Set<Category> categorySet = new HashSet<>();
        for (Gif i : gifList){
            categorySet.add(i.getCategory());
        }
        return categorySet;
    }
}
