package com.kids.api.money;

import java.util.List;

public interface MoneyDao {
    int getTotalMoney(int kidsId);

    int moneyDeposit(Money money);

    int moneyWithdraw(Money money);

    int budgetActivity(Budget budget);

    List<Budget> kidActivityList(int kidId);

    int getTodaySpend(int kidId);

    int getWeekSpend(int kidId);
    
    List<Budget> todayDeposit(int kidsId);
    
    List<Budget> weekDeposit(int kidsId);
}
