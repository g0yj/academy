package 이젠아카데미.model.dao;

public class IncentivesDao {

	private static IncentivesDao incentivesDao = new IncentivesDao();
	public static IncentivesDao getInstance() { return incentivesDao; }
	private IncentivesDao() {}
}
