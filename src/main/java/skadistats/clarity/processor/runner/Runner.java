package skadistats.clarity.processor.runner;

import skadistats.clarity.model.EngineType;
import skadistats.clarity.source.Source;

import java.io.IOException;

public interface Runner<T extends Runner> {

    Context getContext();
    int getTick();
    Source getSource();
    EngineType getEngineType();

    T runWith(Object... processors) throws IOException;

}
