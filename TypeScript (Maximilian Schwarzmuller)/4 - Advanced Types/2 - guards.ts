export{}

type FileData = {
    type: 'file',
    path: string,
}

type Database = {
    type: 'db'
    connectionUrl: string,
}

type Source = FileData | Database;

function isFile(source:Source) {
    return source.type === 'file';
}

function loadData(source:Source) {
    // if('path' in source){
    //     // source.path => Load file data
    //     return;
    // }
    // // source.connectionUrl => Load database data

    if(isFile(source)){
        source.path; // Load file data
        return;
    }
    source.connectionUrl; // Load database data
}

// ----------------------------------------------------------------

class User{
    name: string;
    scan(){};
}

class Admin{
    name: string;
    join(){};
}

type Entity = User | Admin;

function init(entity:Entity) {
    if(entity instanceof User){
        entity.scan();
        return;
    }
    entity.join;
}
