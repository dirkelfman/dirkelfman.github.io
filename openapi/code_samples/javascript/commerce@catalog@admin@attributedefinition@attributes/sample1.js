require('mozu-node-sdk/clients/content/documentlists/document')().getDocuments({
    pageSize: 5,
    documentListName: 'files@mozu'
}, {
    timeout: 60000
});