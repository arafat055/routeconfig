/**
 * Created by asish on 13/6/16.
 *
 *
 */

package challenge.afor.technology.routerconfiq.utils;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.DisplayMetrics;
import android.util.Log;

public final class SharedPreferencesHelper {

	private static final String LOG_TAG = "SharedPreferencesHelper";

	// Dialogs Id
	public static final int DIALOG_ABOUT = 0;
	public static final int DIALOG_NO_CONNECTION = 1;
	public static final int DIALOG_UPDATE_PROGRESS = 2;

	// Menu Groups Id
	public static final int CHANNEL_SUBMENU_GROUP = 0;
	public static final String REMEMBER = "remember";

	// App Preferences
	private static final String PREFS_FILE_NAME = "AppPreferences";
	private static final String PREF_TAB_FEED_KEY = "tabFeed";

	private static final String USER = "user";
	private static final String NUMBER = "number";
	private static final String EMAIL = "email";
	private static final String VERSION = "version";
	private static final String FEEDBACK = "feedback";
	private static final String COMAPARE_1 = "compare1";
	private static final String COMPARE_2 = "compare";
	private static final String COMAPARE_1H = "compare_health_1";
	private static final String COMPARE_2H = "compare_health";


	// Getters for Application configuration attributes and preferences defined
	// in Android Manifest

	public static long getPrefTabFeedId(final Context ctx,
			final long defaultTabFeedId) {
		return ctx.getSharedPreferences(
				SharedPreferencesHelper.PREFS_FILE_NAME, Context.MODE_PRIVATE)
				.getLong(SharedPreferencesHelper.PREF_TAB_FEED_KEY,
						defaultTabFeedId);
	}

	public static void setPrefTabFeedId(final Context ctx, final long feedId) {
		final SharedPreferences prefs = ctx.getSharedPreferences(
				SharedPreferencesHelper.PREFS_FILE_NAME, Context.MODE_PRIVATE);
		final Editor editor = prefs.edit();
		editor.putLong(SharedPreferencesHelper.PREF_TAB_FEED_KEY, feedId);
		editor.commit();
	}

	public static boolean getRemember(final Context ctx) {
		return ctx.getSharedPreferences(
				SharedPreferencesHelper.PREFS_FILE_NAME, Context.MODE_PRIVATE)
				.getBoolean(SharedPreferencesHelper.REMEMBER, false);
	}

	public static void setRemember(final Context ctx, final boolean flag) {
		final SharedPreferences prefs = ctx.getSharedPreferences(
				SharedPreferencesHelper.PREFS_FILE_NAME, Context.MODE_PRIVATE);
		final Editor editor = prefs.edit();
		editor.putBoolean(SharedPreferencesHelper.REMEMBER, flag);
		editor.commit();
	}

	public static String getUser(final Context ctx) {
		return ctx.getSharedPreferences(
				SharedPreferencesHelper.PREFS_FILE_NAME, Context.MODE_PRIVATE)
				.getString(SharedPreferencesHelper.USER, "");
	}

	public static void setUser(final Context ctx, final String user) {
		final SharedPreferences prefs = ctx.getSharedPreferences(
				SharedPreferencesHelper.PREFS_FILE_NAME, Context.MODE_PRIVATE);
		final Editor editor = prefs.edit();
		editor.putString(SharedPreferencesHelper.USER, user);
		editor.commit();
	}

	public static String getEmail(final Context ctx) {
		return ctx.getSharedPreferences(
				SharedPreferencesHelper.PREFS_FILE_NAME, Context.MODE_PRIVATE)
				.getString(SharedPreferencesHelper.EMAIL, "");
	}

	public static void setEmail(final Context ctx, final String user) {
		final SharedPreferences prefs = ctx.getSharedPreferences(
				SharedPreferencesHelper.PREFS_FILE_NAME, Context.MODE_PRIVATE);
		final Editor editor = prefs.edit();
		editor.putString(SharedPreferencesHelper.EMAIL, user);
		editor.commit();
	}


	public static String getVersion(final Context ctx) {
		return ctx.getSharedPreferences(
				SharedPreferencesHelper.PREFS_FILE_NAME, Context.MODE_PRIVATE)
				.getString(SharedPreferencesHelper.VERSION, "");
	}

	public static void setVersion(final Context ctx, final String user) {
		final SharedPreferences prefs = ctx.getSharedPreferences(
				SharedPreferencesHelper.PREFS_FILE_NAME, Context.MODE_PRIVATE);
		final Editor editor = prefs.edit();
		editor.putString(SharedPreferencesHelper.VERSION, user);
		editor.commit();
	}

	public static void setCompareData(final Context ctx, final String node_id,int compare)
	{
		final SharedPreferences prefs = ctx.getSharedPreferences(SharedPreferencesHelper.PREFS_FILE_NAME, Context.MODE_PRIVATE);
		final Editor editor= prefs.edit();
		editor.putString(COMAPARE_1,node_id);
		editor.putInt(COMPARE_2,compare);

		editor.commit();
	}
	public static int getComapreValue(final Context ctx) {
		return ctx.getSharedPreferences(
				SharedPreferencesHelper.PREFS_FILE_NAME, Context.MODE_PRIVATE)
				.getInt(SharedPreferencesHelper.COMPARE_2, 0);
	}

	public static void setCompareDataHealth(final Context ctx, final String node_id,int compare)
	{
		final SharedPreferences prefs = ctx.getSharedPreferences(SharedPreferencesHelper.PREFS_FILE_NAME, Context.MODE_PRIVATE);
		final Editor editor= prefs.edit();
		editor.putString(COMAPARE_1H,node_id);
		editor.putInt(COMPARE_2H,compare);

		editor.commit();
	}
	public static void setComapareEdu(final Context ctx, final String node_id,int compare)
	{
		final SharedPreferences prefs = ctx.getSharedPreferences(SharedPreferencesHelper.PREFS_FILE_NAME, Context.MODE_PRIVATE);
		final Editor editor= prefs.edit();
		editor.putString(COMAPARE_1,node_id);
		editor.putInt(COMPARE_2,compare);

		editor.commit();
	}
	public static int getComapreValueHealth(final Context ctx) {
		return ctx.getSharedPreferences(
				SharedPreferencesHelper.PREFS_FILE_NAME, Context.MODE_PRIVATE)
				.getInt(SharedPreferencesHelper.COMPARE_2H, 0);
	}
	public static int getComapreValueEdu(final Context ctx) {
		return ctx.getSharedPreferences(
				SharedPreferencesHelper.PREFS_FILE_NAME, Context.MODE_PRIVATE)
				.getInt(SharedPreferencesHelper.COMPARE_2, 0);
	}
	public static int getComapreValueEdu2(final Context ctx) {
		return ctx.getSharedPreferences(
				SharedPreferencesHelper.PREFS_FILE_NAME, Context.MODE_PRIVATE)
				.getInt(SharedPreferencesHelper.COMAPARE_1, 0);
	}
	public static String getComapreDataHealth(final Context ctx) {
		return ctx.getSharedPreferences(
				SharedPreferencesHelper.PREFS_FILE_NAME, Context.MODE_PRIVATE)
				.getString(SharedPreferencesHelper.COMAPARE_1H, "");
	}
	public static String getComapreData(final Context ctx) {
		return ctx.getSharedPreferences(
				SharedPreferencesHelper.PREFS_FILE_NAME, Context.MODE_PRIVATE)
				.getString(SharedPreferencesHelper.COMAPARE_1, "");
	}


	public static String getFeedback(final Context ctx) {
		return ctx.getSharedPreferences(
				SharedPreferencesHelper.PREFS_FILE_NAME, Context.MODE_PRIVATE)
				.getString(SharedPreferencesHelper.FEEDBACK, "");
	}

	public static void setFeedback(final Context ctx, final String user) {
		final SharedPreferences prefs = ctx.getSharedPreferences(
				SharedPreferencesHelper.PREFS_FILE_NAME, Context.MODE_PRIVATE);
		final Editor editor = prefs.edit();
		editor.putString(SharedPreferencesHelper.FEEDBACK, user);
		editor.commit();
	}

	public static String getNumber(final Context ctx) {
		return ctx.getSharedPreferences(
				SharedPreferencesHelper.PREFS_FILE_NAME, Context.MODE_PRIVATE)
				.getString(SharedPreferencesHelper.NUMBER, "");
	}

	public static void setNumber(final Context ctx, final String pass) {
		final SharedPreferences prefs = ctx.getSharedPreferences(
				SharedPreferencesHelper.PREFS_FILE_NAME, Context.MODE_PRIVATE);
		final Editor editor = prefs.edit();
		editor.putString(SharedPreferencesHelper.NUMBER, pass);
		editor.commit();
	}



	public static String getFlurryAnalyticsApiKey(final Context ctx) {
		String flurryAnalyticsApiKey = null;
		try {
			final ApplicationInfo ai = ctx.getPackageManager()
					.getApplicationInfo(ctx.getPackageName(),
							PackageManager.GET_META_DATA);
			flurryAnalyticsApiKey = ai.metaData.getString("FLURRY_API_KEY");
		} catch (final NameNotFoundException nnfe) {
			Log.e(SharedPreferencesHelper.LOG_TAG, "", nnfe);
		}
		return flurryAnalyticsApiKey;
	}

	public static String getGoogleAnalyticsProfileId(final Context ctx) {
		String googleAnalyticsProfileId = null;
		try {
			final ApplicationInfo ai = ctx.getPackageManager()
					.getApplicationInfo(ctx.getPackageName(),
							PackageManager.GET_META_DATA);
			googleAnalyticsProfileId = ai.metaData
					.getString("GOOGLE_ANALYTICS_PROFILE_ID");
		} catch (final NameNotFoundException nnfe) {
			Log.e(SharedPreferencesHelper.LOG_TAG, "", nnfe);
		}
		return googleAnalyticsProfileId;
	}




	public static boolean trackGoogleAnalytics(final Context ctx) {
		boolean track = true;
		final String googleAnalyticsProfileId = SharedPreferencesHelper
				.getGoogleAnalyticsProfileId(ctx);

		if (googleAnalyticsProfileId == null
				|| googleAnalyticsProfileId.equalsIgnoreCase("UA-xxxxx-xx")) {
			track = false;
		} else {
			track = true;
		}

		return track;
	}


	// Shared getter util methods

	public static CharSequence getVersionName(final Context ctx) {
		CharSequence version_name = "";
		try {
			final PackageInfo packageInfo = ctx.getPackageManager()
					.getPackageInfo(ctx.getPackageName(), 0);
			version_name = packageInfo.versionName;
		} catch (final NameNotFoundException nnfe) {
			Log.e(SharedPreferencesHelper.LOG_TAG, "", nnfe);
		}
		return version_name;
	}

	public static boolean isTabletDevice(Context activityContext) {
		// Verifies if the Generalized Size of the device is XLARGE to be
		// considered a Tablet
		boolean xlarge = ((activityContext.getResources().getConfiguration().screenLayout &
				Configuration.SCREENLAYOUT_SIZE_MASK) ==
				Configuration.SCREENLAYOUT_SIZE_XLARGE);

		// If XLarge, checks if the Generalized Density is at least MDPI
		// (160dpi)
		if (xlarge) {
			DisplayMetrics metrics = new DisplayMetrics();
			Activity activity = (Activity) activityContext;
			activity.getWindowManager().getDefaultDisplay().getMetrics(metrics);

			// MDPI=160, DEFAULT=160, DENSITY_HIGH=240, DENSITY_MEDIUM=160,
			// DENSITY_TV=213, DENSITY_XHIGH=320
			if (metrics.densityDpi == DisplayMetrics.DENSITY_DEFAULT
					|| metrics.densityDpi == DisplayMetrics.DENSITY_HIGH
					|| metrics.densityDpi == DisplayMetrics.DENSITY_MEDIUM
					|| metrics.densityDpi == DisplayMetrics.DENSITY_TV
					|| metrics.densityDpi == DisplayMetrics.DENSITY_XHIGH) {

				// Yes, this is a tablet!
				return true;
			}
		}

		// No, this is not a tablet!
		return false;
	}

	public static boolean isOnline(final Context ctx) {
		final ConnectivityManager cm = (ConnectivityManager) ctx
				.getSystemService(Context.CONNECTIVITY_SERVICE);
		final NetworkInfo ni = cm.getActiveNetworkInfo();
		if (ni != null) {
			return ni.isConnectedOrConnecting();
		} else {
			return false;
		}
	}
}
