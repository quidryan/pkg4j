package org.jamel.pkg4j.changes;

import java.util.Collections;
import java.util.List;

/**
 * @author Sergey Polovko
 */
public class GitChangeLogProvider implements ChangeLogProvider {

    @Override
    public List<ChangeSet> getChangeLog() {
        return Collections.emptyList();
    }
}
