package com.tecktree.user;

import com.tecktree.exception.AbstractMessageException;

@SuppressWarnings("serial")
public final class DuplicateUserIdException extends AbstractMessageException {

	private final String userId;
	
	public DuplicateUserIdException(String userId) {
		super("Duplicate UserId");
		this.userId = userId;
	}
	
	public String getUserId() {
		return userId;
	}
	
}
