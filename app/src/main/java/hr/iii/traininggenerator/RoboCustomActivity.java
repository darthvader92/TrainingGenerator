package hr.iii.traininggenerator;

import roboguice.RoboGuice;
import roboguice.activity.RoboActivity;

/**
 * Created by smiletic on 28.2.2018..
 */

public class RoboCustomActivity extends RoboActivity {
    static {
        RoboGuice.setUseAnnotationDatabases( false );
    }
}
