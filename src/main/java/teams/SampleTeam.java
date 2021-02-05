package teams;

import java.util.InputMismatchException;
import java.util.Scanner;

import agents.SampleAgent;
import common.Team;
import common.RSPEnum;
import common.Result;
import common.TagTeamAction;

/**
 * チームのサンプル 内部通信はせず，結果も使わない
 */
public class SampleTeam implements Team {
  private SampleAgent agentA;
  private SampleAgent agentB;

  public void init() {
    agentA = new SampleAgent(RSPEnum.SCISORS);
    agentB = new SampleAgent(RSPEnum.ROCK);
  }

  Scanner sc = new Scanner(System.in);

  private RSPEnum scanRSP() {
    System.out.println("R:0, S:1, P:2");
    int r = this.sc.nextInt();
    switch (r % 3) {
      case 0:
        return RSPEnum.ROCK;
      case 1:
        return RSPEnum.SCISORS;
      default:
        return RSPEnum.PAPER;
    }
  }

  TagTeamAction prev = new TagTeamAction(RSPEnum.SCISORS, RSPEnum.ROCK);

  public void before() {

  };

  public void after(Result r) {
    prev = new TagTeamAction(r.EnemyTeamAction.actionA, r.EnemyTeamAction.actionB);
    System.out.println(r);
  };

  public TagTeamAction getAction() {
    /*
     * System.out.println("A?"); var a = this.scanRSP();
     * 
     * System.out.println("B?"); var b = this.scanRSP();
     * 
     * return new TagTeamAction(a, b);
     */
    return prev;
  };
}
