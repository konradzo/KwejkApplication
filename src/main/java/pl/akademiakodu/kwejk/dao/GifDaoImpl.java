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

    private static List<String> gifNames = new ArrayList<>();

    public static List<String> getGifList() {
        return gifNames;
    }

    public GifDaoImpl() {
    }

    public static void setGifList(List<String> gifList) {
        GifDaoImpl.gifNames = gifList;
    }

    static{
        gifNames.add("android-explosion");
        gifNames.add("ben-and-mike");
        gifNames.add("book-dominos");
        gifNames.add("compiler-bot");
    }


    @Override
    public String findByName(String name) {
        for(String gifName: gifNames){
            if(gifName.equals(name))
                return gifName;
        }
        return null;
    }
}
