export{}

type ReadPerms = 'no-read' | 'read';
type WritePerms = 'no-write' | 'write';

type Perms = `${ReadPerms}-${WritePerms}`

type DataFile = {
    data: string,
    permissions: Perms
}

type DataFileEventsNames = `${keyof DataFile}Changed`

type DataFileEvents = {
    [K in DataFileEventsNames]: () => void;
}