package rr.plymouth.myapplication11;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.v7.app.AppCompatActivity;

import java.util.List;

public class WordViewModel extends AndroidViewModel{
    private WordRepository mRepository;
    private LiveData<List<Word>> mAllWords;

    public WordViewModel (Application application) {
        super(application);
        mRepository = new WordRepository(application);
        mAllWords =mRepository.getallWords();
    }

    LiveData<List<Word>> getmAllWords() {
        return mAllWords;
    }
    public void insert (Word word) {
        mRepository.insert(word);
    }

}
