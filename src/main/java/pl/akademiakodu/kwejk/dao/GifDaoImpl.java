package pl.akademiakodu.kwejk.dao;

import org.springframework.stereotype.Component;
import pl.akademiakodu.kwejk.model.Gif;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by slickender on 04.09.2017.
 */
@Component
public class GifDaoImpl implements GifDao{

    private static  List<Gif> gifList=new ArrayList<>();

    public static List<Gif> getGifList() {
        return gifList;
    }

    public static void setGifList(List<Gif> gifList) {
        GifDaoImpl.gifList = gifList;
    }

    static{
        gifList.add(new Gif("android-explosion","użytkownik 1"));
        gifList.add(new Gif("ben-and-mike","użytkownik 2"));
        gifList.add(new Gif("book-dominos","użytkownik 3"));
        gifList.add(new Gif("compiler-bot","użytkownik 4"));
        gifList.add(new Gif("cowboy-coder","użytkownik 5"));
        gifList.add(new Gif("infinite-andrew","użytkownik 6"));
    }

    @Override
    public Gif findOne(String name) {

        return gifList.stream().filter((p)->p.getName().equals(name)).findFirst().get();
    }
}
