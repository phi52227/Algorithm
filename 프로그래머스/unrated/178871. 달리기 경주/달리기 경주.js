function solution(players, callings) {
    var answer = [];
    // let rank = new Map();
    let ranks = {};
    let rank = players.map((item) => item);
    // players.map((item, idx) => rank.set(item,idx));
    // for (let name of callings){
    //     otherName = getKeyByValue(rank, (rank.get(name) - 1));
    //     rank.set(name, (rank.get(name) - 1) );
    //     rank.set(otherName, (rank.get(otherName) + 1) );
    // }

    players.map((item, idx) => {ranks[item] = idx});
    let index;
    
    for (let name of callings){
        index = ranks[name]; // 불린 이름의 현재 순위
        [ranks[name], ranks[rank[index-1]]] = [ranks[rank[index-1]], ranks[name]];
        [rank[index], rank[index-1]] = [rank[index-1], rank[index]];
    }
    
    answer = rank;
    return answer;
}