package br.com.goncalves.pugnotification.notification;

import android.app.NotificationChannel;
import android.support.v4.app.NotificationCompat;

public class Simple extends Builder {
    public Simple(NotificationCompat.Builder builder, NotificationChannel channel, int identifier, String tag) {
        super(builder, channel, identifier, tag);
    }

    @Override
    public void build() {
        super.build();
        super.notificationNotify();
    }
}
