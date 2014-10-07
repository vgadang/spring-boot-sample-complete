package com.aol.demo.service;

import com.aol.demo.model.Preferences;

public interface PreferencesService {

	Preferences getPreference(String sn);

	Preferences createPreference(Preferences preferences);

}
