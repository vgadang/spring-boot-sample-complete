package com.aol.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aol.demo.model.Preferences;
import com.aol.demo.mongo.repository.PreferencesRepository;

@Service
public class PreferencesServiceImpl implements PreferencesService {
	@Autowired
	private PreferencesRepository preferencesRepository;

	@Override
	public Preferences getPreference(String sn) {
		return preferencesRepository.findOne(sn);
	}

	@Override
	public Preferences createPreference(Preferences preferences) {
		return preferencesRepository.save(preferences);
	}

}