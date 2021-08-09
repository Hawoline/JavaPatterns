package com.hawoline.patterns.behavioural.iterator;

import java.util.ArrayList;
import java.util.List;

public class FacebookIterator implements ProfileIterator {
    private Facebook mFacebook;
    private String type;
    private String email;
    private int currentPosition = 0;
    private List<String> emails = new ArrayList<>();
    private List<Profile> mProfiles = new ArrayList<>();

    public FacebookIterator(Facebook facebook, String type, String email) {
        mFacebook = facebook;
        this.type = type;
        this.email = email;
    }

    private void lazyLoad() {
        if (emails.size() == 0) {
            List<String> profiles = mFacebook.requestProfileFriendsFromFacebook(this.email, this.type);
            for (String profile: profiles) {
                this.emails.add(profile);
                this.mProfiles.add(null);
            }
        }
    }

    @Override
    public boolean hasNext() {
        lazyLoad();
        return currentPosition < emails.size();
    }

    @Override
    public Profile getNext() {
        if (!hasNext()) {
            return null;
        }

        String friendEmail = emails.get(currentPosition);
        Profile friendProfile = mProfiles.get(currentPosition);
        if (friendProfile == null) {
            friendProfile = mFacebook.requestProfileFromFacebook(friendEmail);
            mProfiles.set(currentPosition, friendProfile);
        }

        currentPosition++;
        return friendProfile;
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }
}
