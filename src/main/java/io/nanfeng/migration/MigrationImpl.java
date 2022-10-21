package io.nanfeng.migration;

import com.googlecode.flyway.core.Flyway;

public class MigrationImpl implements Migration{

    private final Flyway flyway;

    public MigrationImpl(Flyway flyway) {
        this.flyway = flyway;
    }

    @Override
    public void migrate() {
        flyway.migrate();
    }
}
