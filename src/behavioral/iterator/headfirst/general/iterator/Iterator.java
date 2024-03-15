package behavioral.iterator.headfirst.general.iterator;

import behavioral.iterator.headfirst.general.menu.MenuItem;

public interface Iterator {
    boolean hasNext();

    MenuItem next();
}