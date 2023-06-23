function solution(players, callings) {
    var answer = [];
    
    let ranks = {};
    let rank = players.map((item) => item);
    players.map((item, idx) => {ranks[item] = idx});
    let index;
    
    for (let name of callings){
        index = ranks[name]; // 불린 이름의 현재 순위
        [ranks[name], ranks[rank[index-1]]] = [ranks[rank[index-1]], ranks[name]];
        [rank[index], rank[index-1]] = [rank[index-1], rank[index]];
    }
    
    answer = rank;
    // let rank = players.map((item) => item);
    // let index;
    // for (call of callings){
    //     index = rank.indexOf(call);
    //     [rank[index], rank[index-1]] = [rank[index-1], rank[index]];
    // }
    // answer = rank;
    
    return answer;
}