package com.aol.demo.service;

import java.util.List;

import com.aol.demo.model.Preferences;

public interface PreferencesService {

	Preferences getPreference(String sn);

	Preferences createPreference(Preferences preferences);

	List<Preferences> getPreferencesByColor(String color);

}
